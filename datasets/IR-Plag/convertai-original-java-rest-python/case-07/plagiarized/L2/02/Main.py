import numpy as np

# input 4*4 matrix data
print("Enter a 4 by 4 matrix row by row: ")
mtx = np.array([list(map(float, input().split())) for _ in range(4)])

print(f"Sum of the elements in the major diagonal is {np.trace(mtx)}")

