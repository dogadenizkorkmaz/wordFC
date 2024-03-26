import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Metni giriniz: ");
        String text = scanner.nextLine();
        System.out.println();

        Map<String, Integer> wordCountMap = new HashMap<>();

        // Metni kelimelere ayırma
        String[] words = text.split("\\s+");

        // Kelimeleri sayma
        for (String word : words) {
            // Kelimenin önceki sayısını al, eğer yoksa 0 olarak ata
            int count = wordCountMap.getOrDefault(word, 0);
            // Count'u bir artır ve HashMap'e ekle
            wordCountMap.put(word, count + 1);
        }

        // En çok geçen kelimeyi bulma
        String mostFrequentWord = null;
        int maxCount = 0;
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mostFrequentWord = entry.getKey();
            }
        }

        if (mostFrequentWord != null) {
            System.out.println("En çok geçen kelime: " + mostFrequentWord);
            System.out.println("Bu kelime " + maxCount + " kez geçiyor.");
        } else {
            System.out.println("Metinde kelime bulunamadı.");
        }
    }
}
