import numpy as np

def sum_major_diagonal(arr):
    """
    Calculates the sum of the elements in the major diagonal of a 2D array.
    
    Args:
        arr (numpy.ndarray): A 2D array.
    
    Returns:
        float: The sum of the elements in the major diagonal.
    """
    return np.sum(np.diag(arr))

def main():
    # Input a 4x4 matrix row by row
    print("Enter a 4 by 4 matrix row by row:")
    arr = np.array([list(map(float, input().split())) for _ in range(4)])
    
    # Print the sum of the elements in the major diagonal
    print(f"Sum of the elements in the major diagonal is {sum_major_diagonal(arr)}")

if __name__ == "__main__":
    main()

