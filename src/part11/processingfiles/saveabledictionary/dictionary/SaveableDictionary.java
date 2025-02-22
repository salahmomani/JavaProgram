package part11.processingfiles.saveabledictionary.dictionary;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class SaveableDictionary {
    private HashMap<String, String> dictionary;
    private String file;

    public SaveableDictionary() {
        this.dictionary = new HashMap<>();
        this.file = null;
    }

    public SaveableDictionary(String file) {
        this();
        this.file = file;
    }

    public void add(String word, String translation) {
        if (!dictionary.containsKey(word) && !dictionary.containsValue(word)) {
            dictionary.put(word, translation);
            dictionary.put(translation, word);
        }
    }

    public String translate(String word) {
        return dictionary.getOrDefault(word, null);
    }

    public void delete(String word) {
        String translation = dictionary.get(word);
        if (translation != null) {
            dictionary.remove(word);
            dictionary.remove(translation);
        }
    }

    public boolean load() {
        if (this.file == null) {
            return false;
        }
        try (Scanner scanner = new Scanner(new File(this.file))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(":");
                if (parts.length == 2) {
                    add(parts[0], parts[1]);
                }
            }
            return true;
        } catch (IOException e) {
            return false;
        }
    }

    public boolean save() {
        if (this.file == null) {
            return false;
        }
        try (FileWriter writer = new FileWriter(this.file)) {
            HashMap<String, Boolean> written = new HashMap<>();
            for (String key : dictionary.keySet()) {
                if (!written.containsKey(key)) {
                    writer.write(key + ":" + dictionary.get(key) + "\n");
                    written.put(key, true);
                    written.put(dictionary.get(key), true);
                }
            }
            return true;
        } catch (IOException e) {
            return false;
        }
    }

}
