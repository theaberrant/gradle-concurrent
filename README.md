# Attempting to fork a javaexec process via gradle

## Motivation

For another project (private), I need to run several processes concurrently.  This is a stab at doing the same.

## Solution

Not entirely sure yet.  Right now I loop through a list (using .each) and call a javaexec task (not sure how to pass it parameters).

## Running

```sh
gradle runConcurrently
```

## Caveats

This doesn't work as I intend it.