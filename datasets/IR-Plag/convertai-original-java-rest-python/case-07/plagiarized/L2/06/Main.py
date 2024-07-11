import numpy as np

def sum_major_diagonal(arr):
    """
    Calculates the sum of the elements in the major diagonal of a square matrix.
    
    Args:
        arr (numpy.ndarray): A square matrix.
    
    Returns:
        float: The sum of the elements in the major diagonal.
    """
    return np.sum(np.diag(arr))

if __:
    # Get input matrix from user
    print("Enter a 4 by 4 matrix row by row:")
    arr = np.array([list(map(float, input().split())) for _ in range(4)])
    
    # Calculate and print the sum of the major diagonal
    print(f"Sum of the elements in the major diagonal is {sum_major_diagonal(arr)}")

