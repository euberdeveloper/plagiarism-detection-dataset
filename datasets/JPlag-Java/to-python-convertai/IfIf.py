import sys

if __name__ == "__main__":
    if len(sys.argv) > 1:
        print(sys.argv[1:])
    else:
        raise ValueError("No command-line arguments provided.")

