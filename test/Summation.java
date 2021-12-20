public class Summation {
public static void main(String a[]) {
int sum = 0;
int invalid = 0;
for (int I = 0; I < a.length; I++) {
try {
sum += Integer.parseInt(a[I]);
} catch (NumberFormatException e) {
invalid++;
}
}
System.out.println("Total no.of arguments: "+a.length);
System.out.println("Invalid Integers: "+invalid);
System.out.println("Sum: "+sum);
}
}
