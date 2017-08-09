from __future__ import print_function

def printUntilN(n):
    for i in range(1, n + 1):
        print(i, end='')

if __name__ == '__main__':
    n = int(raw_input())
    printUntilN(n)
