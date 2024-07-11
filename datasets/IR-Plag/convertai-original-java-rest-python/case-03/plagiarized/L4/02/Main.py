import math

def count_height_user(feet, inches):
    return feet * 12 + inches

def count_bmi(height, weight):
    return weight * 0.45359237 / ((height * 0.0254) * (height * 0.0254))

def print_bmi(bmi):
    if bmi < 18.5:
        print("Underweight")
    elif bmi < 25:
        print("Normal")
    elif bmi < 30:
        print("Overweight")
    else:
        print("Obese")

def main():
    # Prompt the user to enter weight in pounds
    weight_user = float(input("Enter weight in pounds: "))

    # Prompt the user to enter height
    # enter feet
    feet_user = float(input("Enter feet: "))
    # enter inches
    inches_user = float(input("Enter inches: "))

    # Process
    height_user = count_height_user(feet_user, inches_user)
    # Compute BMI
    bmi = count_bmi(height_user, weight_user)
    # Display result
    print(f"BMI is {bmi:.2f}")
    print_bmi(bmi)

if __name__ == "__main__":
    main()

