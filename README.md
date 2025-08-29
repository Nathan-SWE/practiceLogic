![GitHub repo size](https://img.shields.io/github/repo-size/Nathan-SWE/practiceLogic?style=for-the-badge)&nbsp;
![GitHub language count](https://img.shields.io/github/languages/count/Nathan-SWE/practiceLogic?style=for-the-badge)

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

<details>
<summary><h4>✅ BE1005 - Average 1</h4></summary>

**Description:**  
Read two floating points' values of double precision A and B, corresponding to two student's grades. After this, calculate the student's average, considering that grade A has weight 3.5 and B has weight 7.5. Each grade can be from zero to ten, always with one digit after the decimal point. Don’t forget to print the end of line after the result, otherwise you will receive “Presentation Error”. Don’t forget the space before and after the equal sign.

**Input:**  
The input file contains 2 floating points' values with one digit after the decimal point.

**Output:**
Print the message "MEDIA"(average in Portuguese) and the student's average according to the following example, with 5 digits after the decimal point and with a blank space before and after the equal signal.

**Solution (Java):**

```java
import java.util.Scanner;

public class be1005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = 0; double b = 0;

        a = sc.nextDouble();
        b = sc.nextDouble();
        sc.close();

        double average = calcAverage(a, b);

        System.out.printf("MEDIA = %.5f\n", average);
    }

    public static double calcAverage(double a, double b) {
        return ((a * 3.5) + (b * 7.5)) / 11;
    }
}
```

</details>

<details>
<summary><h4>✅ BE1006 - Average 2</h4></summary>

**Description:**  
Read three values (variables A, B and C), which are the three student's grades. Then, calculate the average, considering that grade A has weight 2, grade B has weight 3 and the grade C has weight 5. Consider that each grade can go from 0 to 10.0, always with one decimal place.

**Input:**  
The input file contains 3 values of floating points (double) with one digit after the decimal point.

**Output:**
Print the message "MEDIA"(average in Portuguese) and the student's average according to the following example, with a blank space before and after the equal signal.

**Solution (Java):**

```java
import java.util.Scanner;

public class be1006 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        sc.close();

        double average = calcAverage(a, b, c);

        System.out.printf("MEDIA = %.1f\n", average);
    }

    public static double calcAverage(double a, double b, double c) {
        double weight2 = 2.0;
        double weight3 = 3.0;
        double weight5 = 5.0;
        double totalWeight = weight2 + weight3 + weight5;

        return ((a * weight2) + (b * weight3) + (c * weight5)) / totalWeight;
    }
}

```

</details>

<details>
<summary><h4>✅ BE1007 - Difference</h4></summary>

**Description:**  
Read four integer values named A, B, C and D. Calculate and print the difference of product A and B by the product of C and D (A \* B - C \* D).

**Input:**  
The input file contains 4 integer values.

**Output:**
Print **DIFERENCA** (DIFFERENCE in Portuguese) with all the capital letters, according to the following example, with a blank space before and after the equal signal.

**Solution (Java):**

```java
import java.util.Scanner;

public class be1007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        sc.close();

        int diference = calcDiference(a, b, c, d);

        System.out.printf("DIFERENCA = %d\n", diference);
    }

    public static int calcDiference(int a, int b, int c, int d) {
        return (a*b) - (c*d);
    }
}
```

</details>
<details>
<summary><h4>✅ BE1008 - Salary</h4></summary>

**Description:**  
Write a program that reads an employee's number, his/her worked hours number in a month and the amount he received per hour. Print the employee's number and salary that he/she will receive at end of the month, with two decimal places.

- Don’t forget to print the line's end after the result, otherwise you will receive “Presentation Error”.
- Don’t forget the space before and after the equal signal and after the U$.

**Input:**  
The input file contains 2 integer numbers and 1 value of floating point, representing the number, worked hours amount and the amount the employee receives per worked hour.

**Output:**
Print the number and the employee's salary, according to the given example, with a blank space before and after the equal signal.

**Solution (Java):**

```java
import java.util.Locale;
import java.util.Scanner;

public class be1008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int workerNumber = sc.nextInt();
        int workedHours = sc.nextInt();
        double amountPerHour = sc.nextDouble();
        sc.close();

        double monthIncome = calcSalary(workedHours, amountPerHour);

        System.out.printf("NUMBER = %d\n", workerNumber);
        System.out.printf("SALARY = U$ %.2f\n", monthIncome);
    }

    public static double calcSalary(int workedHours, double amountPerHour) {
        return workedHours * amountPerHour;
    }
}

```

</details>

<details>
<summary><h4>✅ BE1009 - Salary with Bonus</h4></summary>

**Description:**  
Make a program that reads a seller's name, his/her fixed salary and the sale's total made by himself/herself in the month (in money). Considering that this seller receives 15% over all products sold, write the final salary (total) of this seller at the end of the month , with two decimal places.

- Don’t forget to print the line's end after the result, otherwise you will receive “Presentation Error”.

- Don’t forget the blank spaces.
- Don’t forget to print the line's end after the result, otherwise you will receive “Presentation Error”.
- Don’t forget the space before and after the equal signal and after the U$.

**Input:**  
The input file contains a text (employee's first name), and two double precision values, that are the seller's salary and the total value sold by him/her.

**Output:**
Print the seller's total salary, according to the given example.

**Solution (Java):**

```java
import java.util.Locale;
import java.util.Scanner;

public class be1009 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Locale.setDefault(Locale.US);

        String name = sc.nextLine();
        double baseSalary = sc.nextDouble();
        double monthlySales =  sc.nextDouble();
        sc.close();

        double finalSalary = calcSalaryBonuses(baseSalary, monthlySales);

        System.out.printf("TOTAL = R$ %.2f\n", finalSalary);
    }
    public static double calcSalaryBonuses(double baseSalary, double monthlySales) {
        return baseSalary + (monthlySales * 0.15);
    }
}
```

</details>

<details>
<summary><h4>✅ BE1010 - Simple Calculate</h4></summary>

**Description:**  
In this problem, the task is to read a code of a product 1, the number of units of product 1, the price for one unit of product 1, the code of a product 2, the number of units of product 2 and the price for one unit of product 2. After this, calculate and show the amount to be paid.

**Input:**  
The input file contains two lines of data. In each line there will be 3 values: two integers and a floating value with 2 digits after the decimal point.

**Output:**
The output file must be a message like the following example where "Valor a pagar" means Value to Pay. Remember the space after ":" and after "R$" symbol. The value must be presented with 2 digits after the point.

**Solution (Java):**

```java
import java.util.Locale;
import java.util.Scanner;

public class be1010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        final int TOTAL_PRODUCTS = 2;
        double finalValue = 0;

        for (int i = 0; i < TOTAL_PRODUCTS; i++) {
            finalValue += calcTotalValue(sc);
        }

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", finalValue);
        sc.close();
    }
    public static double calcTotalValue(Scanner scanner) {
        int productCode = scanner.nextInt();
        int quantity = scanner.nextInt();
        double price = scanner.nextDouble();
        return quantity * price;
    }
}

```

</details>

<details>
<summary><h4>✅ BE1011 - Sphere</h4></summary>

**Description:**  
Make a program that calculates and shows the volume of a sphere being provided the value of its radius (R) . The formula to calculate the volume is: (4/3) \* pi \* R³. Consider (assign) for pi the value 3.14159.

Tip: Use (4/3.0) or (4.0/3) in your formula, because some languages (including C++) assume that the division's result between two integers is another integer.

**Input:**  
The input contains a value of floating point (double precision).

**Output:**
The output must be a message "VOLUME" like the following example with a space before and after the equal signal. The value must be presented with 3 digits after the decimal point.

**Solution (Java):**

```java
import java.util.Scanner;
import java.util.Locale;

public class be1011 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        final double PI = 3.14159;
        double radius =  sc.nextDouble();
        sc.close();

        double sphere = calcSphereVolume(radius, PI);

        System.out.printf("VOLUME = %.3f\n", sphere);
    }

    public static double calcSphereVolume(double radius, double PI){
        return (4.0/3.0) * PI * (radius * radius * radius);
    }
}

```

</details>

<details>
<summary><h4>✅ BE1012 - Area</h4></summary>

**Description:**  
Make a program that reads three floating point values: A, B and C. Then, calculate and show:

- a\) the area of the rectangled triangle that has base A and height C.
- b\) the area of the radius's circle C. (pi = 3.14159)
- c\) the area of the trapezium which has A and B by base, and C by height.
- d\) the area of ​​the square that has side B.
- e\) the area of the rectangle that has sides A and B.

**Input:**  
The input file contains three double values with one digit after the decimal point.

**Output:**
The output file must contain 5 lines of data. Each line corresponds to one of the areas described above, always with a corresponding message (in Portuguese) and one space between the two points and the value. The value calculated must be presented with 3 digits after the decimal point.

**Solution (Java):**

```java
import java.util.Scanner;

public class be1012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double PI = 3.14159;

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        sc.close();

        double areaTriangleRetangle = calcAreaTriangleRetangle(a, c);
        double areaCircle = calcAreaCircle(c, PI);
        double areaTrapezium = calcAreaTrapezium(a, b, c);
        double areaSquare = calcAreaSquare(b);
        double areaRectangle = areaRectangle(a, b);

        System.out.printf("TRIANGULO: %.3f\n", areaTriangleRetangle);
        System.out.printf("CIRCULO: %.3f\n", areaCircle);
        System.out.printf("TRAPEZIO: %.3f\n", areaTrapezium);
        System.out.printf("QUADRADO: %.3f\n", areaSquare);
        System.out.printf("RETANGULO: %.3f\n", areaRectangle);
    }

    public static double calcAreaTriangleRetangle(double baseA,double heightB){
        return  (baseA * heightB) / 2;
    }

    public static double calcAreaCircle(double radius,double PI){
        return PI * (radius * radius);
    }

    public static double calcAreaTrapezium(double baseA,double baseB,double heightC){
        return (baseA + baseB) *  heightC / 2;
    }

    public static double calcAreaSquare(double side){
        return side * side;
    }

    public static double areaRectangle(double baseA, double heightB){
        return baseA * heightB;
    }
}

```

</details>

<details>
<summary><h4>✅ BE1013 - The Greatest</h4></summary>

**Description:**  
Make a program that reads 3 integer values and present the greatest one followed by the message "eh o maior".

**Input:**  
The input file contains 3 integer values.

**Output:**
Print the greatest of these three values followed by a space and the message “eh o maior”.

**Solution (Java):**

```java
package javaPractice;

import java.util.Scanner;

public class be1013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();

        int bigger = getBiggerInt(a, b, c);

        System.out.printf("%d eh o maior\n", bigger);

    }
    public static int getBiggerInt(int a, int b, int c) {
        if(a >= b && a >= c) return a;

        if(b >= a && b >= c) return b;

        return c;
    }
}


```

</details>

<details>
<summary><h4>✅ BE1014 - Consumption</h4></summary>

**Description:**  
Calculate a car's average consumption being provided the total distance traveled (in Km) and the spent fuel total (in liters).

**Input:**  
The input file contains two values: one integer value X representing the total distance (in Km) and the second one is a floating point number Y representing the spent fuel total, with a digit after the decimal point.

**Output:**
Present a value that represents the average consumption of a car with 3 digits after the decimal point, followed by the message "km/l".

**Solution (Java):**

```java
import java.util.Scanner;

public class be1014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int distanceInKm = sc.nextInt();
        double fuelSpent = sc.nextDouble();
        sc.close();

        double consumption = calcConsumption(distanceInKm, fuelSpent);

        System.out.printf("%.3f km/l\n", consumption);
    }

    public static double calcConsumption(int distance, double fuel) {
        if (fuel > 0) return distance / fuel;

        return 0;
    }
}

```

</details>

<details>
<summary><h4>✅ BE1015 - Distance Between Two Points</h4></summary>

**Description:**  
Read the four values corresponding to the x and y axes of two points in the plane, p1 (x1, y1) and p2 (x2, y2) and calculate the distance between them, showing four decimal places, according to the formula:

**Input:**  
The input file contains two lines of data. The first one contains two double values: x1 y1 and the second one also contains two double values with one digit after the decimal point: x2 y2.

**Output:**
Calculate and print the distance value using the provided formula, with 4 decimal places.

**Solution (Java):**

```java
import java.util.Scanner;

public class be1015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        sc.close();

        double distance = calcDistance(x1,y1,x2,y2);

        System.out.printf("%.4f\n",distance);
    }
    public  static double calcDistance(double x1,double y1,double x2,double y2) {
        return Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));
    }
}
```

</details>

<details>
<summary><h4>✅ BE1016 - Distance</h4></summary>

**Description:**  
Two cars (X and Y) leave in the same direction. The car X leaves with a constant speed of 60 km/h and the car Y leaves with a constant speed of 90 km / h.

In one hour (60 minutes) the car Y can get a distance of 30 kilometers from the X car, in other words, it can get away one kilometer for each 2 minutes.

Read the distance (in km) and calculate how long it takes (in minutes) for the car Y to take this distance in relation to the other car.

**Input:**  
The input file contains 1 integer value.

**Output:**
Print the necessary time followed by the message "minutos" that means minutes in Portuguese.

**Solution (Java):**

```java
import java.util.Scanner;

public class be1016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int distance = sc.nextInt();
        sc.close();

        int timeInMinutes = calcTimeSpent(distance);

        System.out.printf("%d minutos\n", timeInMinutes);
    }

    public static int calcTimeSpent(int distance) {
        int hourInMinutes = 60;
        int differenceInKM = 30;

        return (hourInMinutes * distance) / differenceInKM;
    }
}
```

</details>
</details>
