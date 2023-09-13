package com.streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FileLinesAndFilesWrite {

	public static void main(String[] args) {
		String filePathString = "input.txt";

		try {
			Path filePath = Paths.get(filePathString);
			List<String> sortedLines = Files.lines(Paths.get("input.txt")).sorted()
					.collect(Collectors.toList());

			Files.write(filePath, sortedLines);

			System.out.println("Sorted content overwritten in " + filePath);
		} catch (IOException e) {
			System.err.println("An error occurred: " + e.getMessage());
		}
	}
}
