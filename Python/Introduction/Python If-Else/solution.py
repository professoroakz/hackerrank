def numbers(n):
    if n % 2 != 0:
        print "Weird"
    elif n >= 2 and n <= 5:
        print "Not Weird"
    elif n >= 6 and n <= 20:
        print "Weird"
    else:
        print "Not Weird"

if __name__ == '__main__':
    n = int(raw_input())
    numbers(n)
