# Groovy NullPointerException with List

This repository demonstrates a common error in Groovy related to handling null values when working with Lists. The `NullPointerException` occurs when a null value is passed to a method expecting a `List` as input.

## Bug Description

The `myMethod` function iterates through a `List` and prints each element. However, if a `null` is passed as input, a `NullPointerException` is thrown during the call to `each()`.

## Solution

The solution involves using Groovy's safe navigation operator (`?.`) to safely handle the case when the input list is `null`.