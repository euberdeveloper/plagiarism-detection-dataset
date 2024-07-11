import numpy as np

# input 4*4 matrix data
m = np.zeros((4, 4))
print("Enter a 4 by 4 matrix row by row:")
for i in range(4):
    m[i] = [float(x) for x in input().split()]

print(f"Sum of the elements in the major diagonal is {np.trace(m)}")

