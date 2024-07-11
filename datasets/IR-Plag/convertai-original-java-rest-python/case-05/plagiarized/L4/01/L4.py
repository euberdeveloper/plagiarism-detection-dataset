nomor = 0
print("Enter an integer: ", end="")

nomor = int(input())

sisa = 0
while nomor != 0:
    sisa = nomor % 10
    print(sisa, end="")
    nomor = nomor // 10

print()

