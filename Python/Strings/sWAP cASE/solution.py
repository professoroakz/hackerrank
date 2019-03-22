# 8 min
def swap_case(s):
    swap = ''
    for x in s:
        if x.islower():
            swap += x.upper()
        else:
            swap += x.lower()
    return swap
