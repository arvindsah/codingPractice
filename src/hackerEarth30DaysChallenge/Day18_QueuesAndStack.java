package hackerEarth30DaysChallenge;


import java.io.*;
import java.util.*;

// learn about queue 
// linkedlist implements queue iterface
// queue intercace- add, remove, poll, peek (gets the element which is second fro last)
//FIFO


//Stack - LIFO
// push and pop , peek(second item after pop)

public class Day18_QueuesAndStack {
    // Write your code here.

	
	
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        Day18_QueuesAndStack p = new Day18_QueuesAndStack();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
        	System.out.println(p.popCharacter() +""+ p.dequeueCharacter());
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;                
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is " 
                           + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }

	private Object dequeueCharacter() {
		return queue.poll();
	}

	private Object popCharacter() {
		return stack.pop();
	}
	Queue<Character> queue=new LinkedList<Character>();
	private void enqueueCharacter(char c) {
		queue.add(c);
	}
	Stack<Character> stack= new Stack<Character>();
	private void pushCharacter(char c) {
		stack.push(c);
	}
}
