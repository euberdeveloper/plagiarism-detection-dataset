import numpy as np

def sum(m):
    """
    Adds up all the elements in the major diagonal of a 2D array.
    
    Args:
        m (numpy.ndarray): A 2D array.
    
    Returns:
        float: The sum of the elements in the major diagonal.
    """
    return np.sum(np.diag(m))

def main():
    print("Enter a 4 by 4 matrix row by row:")
    ma = np.array([input().split() for _ in range(4)], dtype=float)
    print(f"Sum of the elements in the major diagonal is {sum(ma)}")

if __name__ == "__main__":
    main()

