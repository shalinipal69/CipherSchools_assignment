package boggle;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Board {

	private die[] dice;
	private Random rand;
	private String[][] grid;
	private Trie trie;
	private Set<String> words = new TreeSet<>();
	private int size;
	
	
	public Board(Random rand) {
		this.rand = rand;
		initDice();
		size= 4;
		grid = new String[size][size];
		
		// TODO: refactor
		for (int i=0; i<dice.length; i++) {
			int loc = rand.nextInt(size*size);
			die tmp = dice[i];
			dice[i] = dice[loc];
			dice[loc] = tmp;
		}
		int index = 0;
		for (int r=0; r<size; r++) {
			for (int c=0; c<size; c++) {
				grid[r][c] = dice[index].roll(rand);
				index++;
			}
		}
		
		// TODO: refactor
		makeTrie("words.txt");
		
		// helper method???
		for (int r=0; r<size; r++) {
			for (int c=0; c<size; c++) {
				findWords("", r, c, new HashSet<String>(), words);
			}
		}
		
	}
	
	public String getLetter(int row, int col) {
		if (row < 0 || row >= 4 || col < 0 || col >= 4) {
			throw new IndexOutOfBoundsException(
					String.format("Row %d Col %d out of bounds", row, col));
		}
		return grid[row][col];
	}
	
	public String toString() {
		StringBuffer buf = new StringBuffer();
		for (int r=0; r<4; r++) {
			for (int c=0; c<4; c++) {
				buf.append(getLetter(r, c));
				buf.append(" ");
			}
			buf.append("\n");
		}
		return buf.toString();
	}

	private void makeTrie(String filename) {
		trie = new Trie();
		Scanner scan;
		try {
			scan = new Scanner(new FileInputStream(filename));
			while (scan.hasNext()) {//nextline
				trie.insert(scan.next().toUpperCase());
			}
			scan.close();
		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		}
	}
	

	
	
	
	private static String coord(int row, int col) {
		return row + "-" + col;
	}
	
	private void findWords(String prefix, int row, int col, Set<String> visited, Set<String> words) {
		String word = prefix + getLetter(row, col);
		if (!trie.hasPath(word)) {
			return;
		}
		if (trie.contains(word) && word.length() > 2) {
			words.add(word);
		}
		visited.add(coord(row, col));
		for (int r=row-1; r<=row+1; r++) {
			for (int c=col-1; c<=col+1; c++) {
				if (r < 0 || r > size-1 || c < 0 || c > size-1) {
					continue;
				}
				if (r == row && c == col) {
					continue; //findwords will only be called for all non visited neighbours
				}
				Set<String> copy = new HashSet<>(visited);
				findWords(word, r, c, copy, words);
			}
		}
	}
	
	public Set<String> getWords() {
		return this.words;
	}
	
	

	private void initDice() {
		dice=new die[] {
				new die("J", "B", "O", "A", "B", "O"),
				new die("H", "W", "V", "E", "T", "R"),
				new die("M", "U", "O", "C", "T", "I"),
				new die("N", "E", "E", "G", "A", "A"),
				new die("C", "S", "O", "A", "P", "H"),
				new die("I", "T", "E", "S", "O", "S"),
				new die("E", "E", "H", "N", "W", "G"),
				new die("A", "W", "T", "O", "T", "O"),
				new die("I", "U", "N", "E", "E", "S"),
				new die("A", "F", "P", "S", "K", "F"),
				new die("E", "Y", "L", "D", "R", "V"),
				new die("Z", "H", "R", "L", "N", "N"),
				new die("Y", "T", "L", "E", "T", "R"), 
				new die("I", "T", "S", "T", "D", "Y"),
				new die("U", "N", "H", "I", "M", "Q"),
				new die("D", "R", "X", "I", "L", "E")
		};
	}

	
	public static void main(String[] args) {
		//Random r = new Random(1);
		Random r = new Random();
		
		Board board = new Board(r);
		
		System.out.println(board);
		
		System.out.println(board.getWords().size());
		
		for (String s : board.getWords()) {
			System.out.println(s);
		}
	}
	
}
