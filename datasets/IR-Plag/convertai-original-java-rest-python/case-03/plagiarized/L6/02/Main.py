import math

def count_height_user(feet, inches):
    return feet * 12 + inches

def count_bmi(height, weight):
    return weight * 0.45359237 / (math.pow((height * 0.0254), 2))

def print_bmi(bmi):
    if bmi < 18.5:
        print("Underweight")
    elif 18.5 <= bmi < 25:
        print("Normal")
    elif 25 <= bmi < 30:
        print("Overweight")
    elif bmi >= 30:
        print("Obese")

def main():
    inches_user = float(input("Enter inches: "))
    weight_user = float(input("Enter weight in pounds: "))
    feet_user = float(input("Enter feet: "))

    height_user = count_height_user(feet_user, inches_user)
    bmi = count_bmi(height_user, weight_user)
    print(f"BMI is {bmi}")
    print_bmi(bmi)

if __name__ == "__main__":
    main()

