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
</details>
