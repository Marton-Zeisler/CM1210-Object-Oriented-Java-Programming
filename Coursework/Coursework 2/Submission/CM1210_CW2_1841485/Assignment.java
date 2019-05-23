import java.util.*;
import java.io.*;

// 1841485 - Marton Zeisler

class Assignment {
	
	static int moves;
	static int swaps;
	
	public static void main(String[] args) {
		ArrayList<String> nonStopWords = removeStopwords("GPT2.txt", "stopwords.txt");
		
		//System.out.println(nonStopWords);
		
		startInsertionSort(nonStopWords);
		startMergeSort(nonStopWords);
		
	}
		
	public static ArrayList<String> removeStopwords(String fileNameGPT2, String fileNameStopwords){
		ArrayList<String> nonstopWords = new ArrayList<String>();
		
		HashMap<String,Boolean> nonStopWordsHash = new HashMap<String,Boolean>();
		HashMap<String,Boolean> stopWords = getStopWords(fileNameStopwords);
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader(fileNameGPT2));
			String line;
			
			while ((line = reader.readLine()) != null){
				if(line.contains("wwww") || line.contains("http") || line.length() == 0){
					continue;
				}
				
				line = line.replace("'s", "");
				line = line.replace("'ve", "");
				line = line.replace("'ll", "");
				line = line.replace("\n", "");
				String words[] = line.split("\\W+");
				for(String word : words){
					word = word.toLowerCase();
					if(!stopWords.containsKey(word) && !word.equals("") && !nonStopWordsHash.containsKey(word) && isStringWord(word)){
						nonstopWords.add(word);
						nonStopWordsHash.put(word, true);
					}
				}
			}
		} catch (Exception e) {
			System.out.println("There was a problem with reading " + fileNameGPT2);
		}
		
		return nonstopWords;
	}
	
	public static HashMap<String,Boolean> getStopWords(String fileNameStopwords){
		HashMap<String,Boolean> stopWords = new HashMap<String,Boolean>();
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader(fileNameStopwords));
			String line;
			while ((line = reader.readLine()) != null){
				stopWords.put(line, true);
			}
		} catch (Exception e) {
			System.out.println("There was a problem with reading " + fileNameStopwords);
		}
		
		return stopWords;
	}
	
	public static void startInsertionSort(ArrayList<String> array){
		insertionSortsWordsNumber(array, 100);
		insertionSortsWordsNumber(array, 200);
		insertionSortsWordsNumber(array, 300);
		insertionSortsWordsNumber(array, array.size());
	}
	
	public static void insertionSortsWordsNumber(ArrayList<String> original, int words){
		moves = 0;
		swaps = 0;
		
		ArrayList<String> array = new ArrayList<String>(original.subList(0, words));
		long start = System.nanoTime();
		insertionSort(array);
		long end = System.nanoTime();
		long timeTaken = end - start;
		
		System.out.println("Statistics for sorting " + words + " words using insertion sort:");
		System.out.println("Time taken: " + timeTaken);
		System.out.println("Moves: " + moves);
		System.out.println("Swaps: " + swaps);
		System.out.println();
	}
	
	public static void insertionSort(ArrayList<String> nonStopwords){
		int n = nonStopwords.size();
		
		for(int i=1; i<n; i++){
			String item = nonStopwords.get(i);
			int j = i-1;
			
			while(j>=0 && nonStopwords.get(j).compareTo(item) > 0 ){
				moves++;
				nonStopwords.set(j+1, nonStopwords.get(j));
				swaps++;
				j = j-1;
			}
			
			nonStopwords.set(j+1, item);
			moves++;
		}
	}
	
	public static void startMergeSort(ArrayList<String> array){
		mergeSortsWordsNumber(array, 100);
		mergeSortsWordsNumber(array, 200);
		mergeSortsWordsNumber(array, 300);
		mergeSortsWordsNumber(array, array.size());
	}
	
	public static void mergeSortsWordsNumber(ArrayList<String> original, int words){
		moves = 0;
		swaps = 0;
		
		ArrayList<String> array = new ArrayList<String>(original.subList(0, words));
		long start = System.nanoTime();
		mergeSort(array);
		long end = System.nanoTime();
		long timeTaken = end - start;
		
		System.out.println("Statistics for sorting " + words + " words using merge sort:");
		System.out.println("Time taken: " + timeTaken);
		System.out.println("Moves: " + moves);
		System.out.println("Swaps: " + swaps);
		System.out.println();
	}
	
	public static void mergeSort(ArrayList<String> array){
		moves++;
		
		if(array.size() < 2){
			return;
		}
		
		int middle = array.size() / 2;
		
		ArrayList<String> left = new ArrayList<String>();
		for (int i = 0; i < middle; i++) {
			left.add(array.get(i));
			moves++;
		}
		
		ArrayList<String> right = new ArrayList<String>();
		for (int i = middle; i < array.size(); i++) {
			right.add(array.get(i));
			moves++;
		}
		
		mergeSort(left);
		mergeSort(right);

		merge(left, right, array);
	}
	
	public static void merge(ArrayList<String> left, ArrayList<String> right, ArrayList<String> merged){
		int k = 0;
		
		while (left.size() != 0 && right.size() != 0) {
			moves++;
			
			if (left.get(0).compareTo(right.get(0)) < 0) {
				swaps++;
				merged.set(k++, left.get(0));
				left.remove(0);
			}else{
				swaps++;
				merged.set(k++, right.get(0));
				right.remove(0);
			}
		}
		
		while (left.size() != 0) {
			moves++;
			swaps++;
			
			merged.set(k++, left.get(0));
			left.remove(0);
		}
		
		while (right.size() != 0) {
			moves++;
			swaps++;
			
			merged.set(k++, right.get(0));
			right.remove(0);
		}
	}
	
	public static boolean isStringWord(String word){
		char chars[] = word.toCharArray();
		
		for (char c : chars) {
			if(!Character.isLetter(c)){
				return false;
			}
		}
		
		return true;
	}
}