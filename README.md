# MSc-Y1-S2-W8-Java-Lab

## Description

MSc-Y1-S2-W8-Java-Lab

## Content with Citations




____

[Card](https://boardgamegeek.com/wiki/page/standard_deck_playing_card_games#:~:text=A%20%22standard%22%20deck%20of%20playing,also%20usually%20include%20two%20Jokers.)

____

```java
for (int i = 0; i < 5; i++) {
  System.out.println(i);
}
```

____

[for loop syntax | W3Schools](https://www.w3schools.com/java/java_for_loop.asp)

____

```java
String[] cars;
```

```java
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
```

```java
int[] myNum = {10, 20, 30, 40};
```

```java
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
System.out.println(cars[0]);
// Outputs Volvo
```

```java
cars[0] = "Opel";
```

```java
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
cars[0] = "Opel";
System.out.println(cars[0]);
// Now outputs Opel instead of Volvo
```

```java
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
System.out.println(cars.length);
// Outputs 4
```

## Solution

### Input

```java
public class Card {
    // suit
    // value

    public static void getCards(){
    
    String[] suits = {"Hearts", "Diamonds", "Spades", "Clubs"};

    String[] values = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
    
        for (String suit : suits) {
            
            for (String value : values) {
                System.out.println(suit + value);
            }
        }
    }

    public static void main(String[] args){
        getCards();
    }
}
```

### Output

```bash
AHearts
2Hearts
3Hearts
4Hearts
5Hearts
6Hearts
7Hearts
8Hearts
9Hearts
10Hearts
JHearts
QHearts
KHearts
ADiamonds
2Diamonds
3Diamonds
4Diamonds
5Diamonds
6Diamonds
7Diamonds
8Diamonds
9Diamonds
10Diamonds
JDiamonds
QDiamonds
KDiamonds
ASpades
2Spades
3Spades
4Spades
5Spades
6Spades
7Spades
8Spades
9Spades
10Spades
JSpades
QSpades
KSpades
AClubs
2Clubs
3Clubs
4Clubs
5Clubs
6Clubs
7Clubs
8Clubs
9Clubs
10Clubs
JClubs
QClubs
KClubs
```

5. Lab help

## References

1. [Java Arrays](https://www.w3schools.com/java/java_arrays.asp)

2. [Card](https://boardgamegeek.com/wiki/page/standard_deck_playing_card_games#:~:text=A%20%22standard%22%20deck%20of%20playing,also%20usually%20include%20two%20Jokers.)

3. [for loop syntax | W3Schools](https://www.w3schools.com/java/java_for_loop.asp)
    
4. [Java Arrays](https://www.w3schools.com/java/java_arrays.asp)

5. Lab help 
