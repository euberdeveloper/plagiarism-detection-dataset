import numpy as np
from typing import List

def sum_major_diagonal(m: List[List[float]]) -> float:
    """
    Calculates the sum of the elements in the major diagonal of a square matrix.
    
    Args:
        m (List[List[float]]): A square matrix represented as a list of lists.
    
    Returns:
        float: The sum of the elements in the major diagonal.
    """
    return sum(m[i][i] for i in range(len(m)))

def main():
    print("Enter a 4 by 4 matrix row by row:")
    m = [list(map(float, input().split())) for _ in range(4)]
    
    print(f"Sum of the elements in the major diagonal is {sum_major_diagonal(m)}")

if __name__ == "__main__":
    main()

