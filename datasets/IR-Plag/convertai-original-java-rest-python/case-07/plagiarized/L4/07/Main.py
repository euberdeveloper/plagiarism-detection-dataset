import numpy as np

# Input a 4x4 matrix row by row
print("Enter a 4 by 4 matrix row by row:")
arr = np.zeros((4, 4))
for i in range(4):
    arr[i] = [float(x) for x in input().split()]

# Sum the elements on the major diagonal
sum_major_diagonal = np.trace(arr)

# Print the result
print(f"Sum of the elements in the major diagonal is {sum_major_diagonal}")

