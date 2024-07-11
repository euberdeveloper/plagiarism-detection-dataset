import numpy as np
from typing import List

def calculate_diagonal_sum(matrix: List[List[float]]) -> float:
    """
    Calculates the sum of the elements in the major diagonal of a 4x4 matrix.
    
    Args:
        matrix (List[List[float]]): A 4x4 matrix represented as a list of lists.
    
    Returns:
        float: The sum of the elements in the major diagonal.
    """
    total = 0
    for i in range(4):
        total += matrix[i][i]
    return total

def main():
    print("Enter a 4 by 4 matrix row by row:")
    matrix = []
    for _ in range(4):
        row = [float(x) for x in input().split()]
        matrix.append(row)
    
    diagonal_sum = calculate_diagonal_sum(matrix)
    print(f"Sum of the elements in the major diagonal is {diagonal_sum}")

if __name__ == "__main__":
    main()

