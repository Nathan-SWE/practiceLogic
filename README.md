# Programming Logic Practice

This repository contains my solutions to programming challenges from platforms such as **BeeCrowd**, **HackerRank**, and **LeetCode**.  
The goal is to improve my problem-solving skills, strengthen algorithmic thinking, and practice different programming concepts through hands-on exercises.

---

<details>
<summary><h2>BeeCrowd</h2></summary>

<details>
<summary><h3>Java</h3></summary>

<details>
<summary><h4>✅ BE1000 - Hello World!</h4></summary>

**Description:**  
Write a program that prints "Hello World!" to the screen.

**Input:**  
No input.

**Output:**

```java
  Hello Word!
```

**Solution (Java):**

```java
public class be1000 {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
```

</details>

<details>
<summary><h4>✅ BE1001 - Extremely Basic</h4></summary>

**Description:**  
Read 2 variables, named A and B and make the sum of these two variables, assigning its result to the variable X. Print X as shown below. Print endline after the result otherwise you will get “Presentation Error”.

**Input:**  
The input file will contain 2 integer numbers.

**Output:**
Print the letter X (uppercase) with a blank space before and after the equal signal followed by the value of X, according to the following example.

Obs.: don't forget the endline after all.

**Solution (Java):**

```java
import java.util.Scanner;

public class be1001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0, b = 0;

        a = sc.nextInt();
        b = sc.nextInt();
        sc.close();

        int result = sum(a, b);

        System.out.printf("X = %d\n", result);
    }

    public static int sum(int a, int b){
        return a + b;
    }
}
```

</details>

<details>
<summary><h4>✅ BE1002 - ExtrArea of a Circle</h4></summary>

**Description:**  
The formula to calculate the area of a circumference is defined as **A = π . R2**. Considering to this problem that **π = 3.14159**:

Calculate the area using the formula given in the problem description.

**Input:**  
The input contains a value of floating point **_(double precision)_**, that is the variable **R**.

**Output:**
Present the message "A=" followed by the value of the variable, as in the example bellow, with four places after the decimal point. Use all double precision variables. Like all the problems, don't forget to print the end of line after the result, otherwise you will receive "Presentation Error".

**Solution (Java):**

```java
import java.util.Scanner;

public class be1002 {
    public static final double PI = 3.14159;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double radius = 0;
        radius = sc.nextDouble();
        sc.close();

        double area = calcCircunferenceArea(radius);

        System.out.printf("A=%.4f\n", area);
    }

    public static double calcCircunferenceArea(double radius){
        return PI * (radius * radius);
    }
}
```

</details>

<details>
<summary><h4>✅ BE1003 - Simple Sum</h4></summary>

**Description:**  
Read two integer values, in this case, the variables A and B. After this, calculate the sum between them and assign it to the variable **SOMA**. Write the value of this variable.

Calculate the area using the formula given in the problem description.

**Input:**  
The input file contains 2 integer numbers.

**Output:**
Print the message "SOMA" with all the capital letters, with a blank space before and after the equal signal followed by the corresponding value to the sum of A and B. Like all the problems, don't forget to print the end of line, otherwise you will receive "Presentation Error"

**Solution (Java):**

```java
import java.util.Scanner;

public class be1003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0; int b = 0;

        a = sc.nextInt();
        b = sc.nextInt();
        sc.close();

        int total = sum(a, b);

        System.out.printf("SOMA = %d\n", total);
    }

    public static int sum(int a, int b) {
        return a + b;
    }
}
```

</details>

<details>
<summary><h4>✅ BE1004 - Simple Product</h4></summary>

**Description:**  
Read two integer values. After this, calculate the product between them and store the result in a variable named **PROD**. Print the result like the example below. Do not forget to print the end of line after the result, otherwise you will receive “Presentation Error”.

Calculate the area using the formula given in the problem description.

**Input:**  
The input file contains 2 integer numbers.

**Output:**
Print the message "PROD" and PROD according to the following example, with a blank space before and after the equal signal.

**Solution (Java):**

```java
import java.util.Scanner;

public class be1004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0; int b = 0;

        a =  sc.nextInt();
        b = sc.nextInt();
        sc.close();

        int prod = calcProd(a, b);

        System.out.printf("PROD = %d\n", prod);
    }

    public static int calcProd(int a, int b) {
        return a * b;
    }
}

```

</details>
</details>
