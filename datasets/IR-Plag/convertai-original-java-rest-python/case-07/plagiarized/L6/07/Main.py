import numpy as np

# Input angka ke dalam array n x n pada bagian ini
print("Enter a 4 by 4 matrix row by row:")
arr = np.zeros((4, 4))
for i in range(4):
    arr[i] = [float(x) for x in input().split()]

# Menjumlahkan angka yang terdapat di dalam array
sum = np.trace(arr)

# Menampilkan hasil dari pemanggilan fungsi sumMajorDiagonal
print(f"Sum of the elements in the major diagonal is {sum}")

