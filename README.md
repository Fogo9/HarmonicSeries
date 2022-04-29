# **HARMONIC SERIES**

## INFORMATION

* **This program is designed to find harmonic serial numbers.**

## TECHNOLOGIES USED

* **JAVA**

## CONTENTS
* The variable **n** is defined with int and the variable **result** with double.

* Scanner class created for user to enter numbers.

* Result is defined as decimal because the result will be a fractional expression.

* The result is found using the division operation of the number entered with the for loop.

## CODES

```Java

        import java.util.Scanner;

        public class harmonicseries{

            public static void main(String[] args) {

                int n;

                double result;

                Scanner scan = new Scanner(System.in);

                System.out.print("Enter The Number : ");


```

```Java

                n = scan.nextInt();

                result = 0.0;

                for(int i = 1; i <= n; i++){

                    result += (1.0/i);

                }

                System.out.println("Harmonic series : " + result);

            }
        }

```

```bash

        Enter The Number : 5
        Harmonic series : 2.283333333333333

```

<br />

## LINK

* Click here https://github.com/Fogo9/HarmonicSeries.git to access the Github page for this project.

<br />

## LICENSE

* This software is licensed By Tuncay Demir under the MIT license.

<br />

>[Patika.dev](https://app.patika.dev/fogomurphy)

<br/>

| Name |  Email |
| ---- |  ----- |
| Tuncay | tuncaydemir682@gmail.com |
