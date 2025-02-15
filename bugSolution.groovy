```groovy
def myMethod(List<String> list) {
    list?.each { element ->
        println element
    }
}

myMethod(null) //This will execute without error
myMethod(['a', 'b', 'c']) //This will also execute without error
```