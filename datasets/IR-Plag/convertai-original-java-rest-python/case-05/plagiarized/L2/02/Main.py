def reverse(nmb):
    while nmb != 0:
        get = nmb % 10
        print(get, end='')
        nmb = nmb // 10
    print()

if __name__ == '__main__':
    # enter the number
    nmb = int(input("Enter an integer: "))
    reverse(nmb)

