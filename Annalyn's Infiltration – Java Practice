# 🏰 Annalyn's Infiltration – Java Practice

**Platform:** Exercism  
**Language:** Java  
**Topic:** Boolean Logic and Logical Operators  
**Difficulty:** Beginner  
**Status:** Practiced ✅

---

## 1. Problem Introduction

Annalyn wants to rescue her kidnapped friend from a forest camp.

There are three characters:

1. **Knight** – A strong soldier.
2. **Archer** – A person with a bow who understands bird signals.
3. **Prisoner** – Annalyn's kidnapped friend.

Annalyn has four possible actions:

- Fast Attack
- Spy
- Signal Prisoner
- Free Prisoner

Our task is to check whether each action is possible based on whether the characters are awake or sleeping.

---

## 2. Important Java Concept: Boolean

A boolean is a data type that stores only two values:

```java
boolean isAwake = true;
boolean isSleeping = false;
```

Remember:

- `true` = Awake
- `false` = Sleeping

In this problem, we use boolean values to make decisions.

---

## 3. Task 1 – Fast Attack

### Problem

Can Annalyn attack the knight quickly?

### Condition

A fast attack is possible only when the knight is sleeping.

### Understand with examples

| Knight Status | Can Attack? |
|---|---|
| Awake (true) | false |
| Sleeping (false) | true |

### Java Operator: NOT (!)

`!` means opposite.

```java
!true  // false
!false // true
```

### Java Code

```java
public static boolean canFastAttack(boolean knightIsAwake) {
    return !knightIsAwake;
}
```

### Explanation

If the knight is awake, return false.

If the knight is sleeping, return true.

**Remember:** Fast attack = Knight sleeping.

---

## 4. Task 2 – Spy

### Problem

Can Annalyn secretly spy on the group?

### Condition

She can spy if at least ONE person is awake.

It can be:
- Knight awake.
- Archer awake.
- Prisoner awake.

Even if only one person is awake, spying is possible.

### Understand with examples

| Knight | Archer | Prisoner | Can Spy? |
|---|---|---|---|
| false | false | false | false |
| true | false | false | true |
| false | true | false | true |
| false | false | true | true |
| true | true | true | true |

### Java Operator: OR (||)

`||` means OR.

If at least one condition is true, the result is true.

```java
true || false  // true
false || true  // true
false || false // false
true || true   // true
```

### Java Code

```java
public static boolean canSpy(
        boolean knightIsAwake,
        boolean archerIsAwake,
        boolean prisonerIsAwake) {

    return knightIsAwake || archerIsAwake || prisonerIsAwake;
}
```

### Explanation

Check all three characters.

If anyone is awake, return true.

If everyone is sleeping, return false.

**Remember:** Spy = At least one person awake.

---

## 5. Task 3 – Signal Prisoner

### Problem

Can Annalyn send a secret message to her friend using bird sounds?

### Condition

Two things must happen:

1. Prisoner must be awake.
2. Archer must be sleeping.

Why?

The archer understands bird signals. If the archer is awake, he might intercept the message.

### Understand with examples

| Archer | Prisoner | Can Signal? |
|---|---|---|
| Sleeping | Awake | true |
| Awake | Awake | false |
| Sleeping | Sleeping | false |
| Awake | Sleeping | false |

### Java Operator: AND (&&)

`&&` means AND.

Both conditions must be true.

```java
true && true   // true
true && false  // false
false && true  // false
false && false // false
```

### Java Code

```java
public static boolean canSignalPrisoner(
        boolean archerIsAwake,
        boolean prisonerIsAwake) {

    return !archerIsAwake && prisonerIsAwake;
}
```

### Explanation

`!archerIsAwake` means the archer must be sleeping.

`prisonerIsAwake` means the prisoner must be awake.

Both conditions must be satisfied.

**Remember:** Signal = Archer sleeping AND Prisoner awake.

---

## 6. Task 4 – Free Prisoner

### Problem

Can Annalyn rescue her friend from the camp?

There are TWO possibilities.

### Case 1: Pet Dog is Present 🐕

If Annalyn brings her loyal dog:

- Knight can be awake or sleeping.
- Prisoner can be awake or sleeping.
- Archer MUST be sleeping.

Why?

The knight is scared of the dog, and the sleeping archer cannot get ready in time.

Java condition:

```java
!archerIsAwake
```

### Case 2: Pet Dog is NOT Present

If Annalyn does not bring her dog:

- Knight must be sleeping.
- Archer must be sleeping.
- Prisoner must be awake.

Why?

Without the dog, Annalyn must sneak into the camp. If the prisoner is sleeping, they might wake the enemies.

Java condition:

```java
!knightIsAwake && !archerIsAwake && prisonerIsAwake
```

### Understand with examples

| Knight | Archer | Prisoner | Dog | Can Free? |
|---|---|---|---|---|
| Awake | Sleeping | Sleeping | Present | true |
| Sleeping | Sleeping | Awake | Present | true |
| Sleeping | Awake | Awake | Present | false |
| Sleeping | Sleeping | Awake | Absent | true |
| Sleeping | Sleeping | Sleeping | Absent | false |
| Awake | Sleeping | Awake | Absent | false |

### Java Operator: Ternary (? :)

The ternary operator helps us choose between two conditions.

Syntax:

```java
condition ? valueIfTrue : valueIfFalse;
```

Example:

```java
int age = 20;

String result = age >= 18 ? "Adult" : "Minor";
```

If age is greater than or equal to 18, result is Adult. Otherwise, Minor.

### Java Code

```java
public static boolean canFreePrisoner(
        boolean knightIsAwake,
        boolean archerIsAwake,
        boolean prisonerIsAwake,
        boolean petDogIsPresent) {

    return petDogIsPresent
            ? !archerIsAwake
            : !knightIsAwake && !archerIsAwake && prisonerIsAwake;
}
```

### Explanation

Read the code like this:

IF the dog is present:

Check whether the archer is sleeping.

ELSE:

Check whether the knight is sleeping AND the archer is sleeping AND the prisoner is awake.

**Remember:** Dog present = Archer sleeping. Dog absent = Both enemies sleeping + Prisoner awake.

---

## 7. Important Java Operators – Quick Revision

| Operator | Name | Meaning |
|---|---|---|
| `!` | NOT | Opposite value |
| `&&` | AND | Both conditions must be true |
| `||` | OR | At least one condition must be true |
| `? :` | Ternary | Choose between two conditions |

### Quick Examples

```java
!true              // false

true && true       // true

true || false      // true

false && true      // false

false || false     // false
```

---

## 8. Complete Java Solution

All four methods together:

```java
class AnnalynsInfiltration {

    // Task 1: Check fast attack
    public static boolean canFastAttack(boolean knightIsAwake) {

        return !knightIsAwake;
    }

    // Task 2: Check spying
    public static boolean canSpy(
            boolean knightIsAwake,
            boolean archerIsAwake,
            boolean prisonerIsAwake) {

        return knightIsAwake || archerIsAwake || prisonerIsAwake;
    }

    // Task 3: Check signaling prisoner
    public static boolean canSignalPrisoner(
            boolean archerIsAwake,
            boolean prisonerIsAwake) {

        return !archerIsAwake && prisonerIsAwake;
    }

    // Task 4: Check freeing prisoner
    public static boolean canFreePrisoner(
            boolean knightIsAwake,
            boolean archerIsAwake,
            boolean prisonerIsAwake,
            boolean petDogIsPresent) {

        return petDogIsPresent
                ? !archerIsAwake
                : !knightIsAwake && !archerIsAwake && prisonerIsAwake;
    }
}
```

---

## 9. What I Learned

After completing this exercise, I learned:

- How to declare boolean variables.
- How to return boolean values from methods.
- How to use the NOT operator (`!`).
- How to use the AND operator (`&&`).
- How to use the OR operator (`||`).
- How to use the ternary operator (`? :`).
- How to convert real-world conditions into Java logic.

---

## 10. Practice Questions

Try answering these without running the code.

**Question 1**

```java
boolean knightIsAwake = false;

canFastAttack(knightIsAwake);
```

What is the output?

**Question 2**

```java
boolean knightIsAwake = false;
boolean archerIsAwake = false;
boolean prisonerIsAwake = true;

canSpy(knightIsAwake, archerIsAwake, prisonerIsAwake);
```

What is the output?

**Question 3**

```java
boolean archerIsAwake = true;
boolean prisonerIsAwake = true;

canSignalPrisoner(archerIsAwake, prisonerIsAwake);
```

What is the output?

**Question 4**

```java
boolean knightIsAwake = false;
boolean archerIsAwake = false;
boolean prisonerIsAwake = true;
boolean petDogIsPresent = false;

canFreePrisoner(knightIsAwake, archerIsAwake, prisonerIsAwake, petDogIsPresent);
```

What is the output?

---

**Practice Summary**

Platform: Exercism  
Exercise: Annalyn's Infiltration  
Language: Java  
Concept: Boolean Logic  
Result: Completed ✅
