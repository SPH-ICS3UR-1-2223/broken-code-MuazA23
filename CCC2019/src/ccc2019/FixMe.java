//This should be able to solve J3 as seen in Instructions.pdf.
package ccc2019;

import java.util.Scanner;

/**
 *
 * @author SPH_SHSM
 */
public class FixMe {
public static void main(String[] args) {
Scanner in = new Scanner(System.in);
int lines = in.nextInt();
in.nextLine();
String output = "";
for (int i = 0; i < lines; i++) {
String input = in.nextLine();
char currentChar = 'a';
int currentCount = '0';
char previousChar;
for (int j = 0; j < input.length(); j++)
if (j == 0) {
currentChar = input.charAt(j);
currentCount = 1;
} else {
previousChar = currentChar;
currentChar = input.charAt(j);
if (currentChar == previousChar) {
currentCount++;
} else {
output += currentCount + " " + previousChar + " ";
currentCount = 1;
}
if (j == input.length() - 1) {
output += currentCount + " " + currentChar + " ";
}
}
}
output += " \n ";
System.out.print(output);
in.close();
}
}