import math

def main():
    print("Enter weight in pounds: ", end="")
    weight = float(input())

    print("Enter feet: ", end="")
    feet = float(input())
    print("Enter inches: ", end="")
    inches = float(input())

    # Print Hasil perhitungan
    bmi = calculate_bmi(weight, (feet * 12) + inches)
    print_bmi_category(bmi)

def calculate_bmi(weight, height):
    temp = height * 0.0254
    return weight * 0.45359237 / (temp * temp)

def print_bmi_category(bmi):
    print(f"BMI is {bmi:.2f}")
    if bmi > 30:
        print("Obese")
    elif bmi > 25:
        print("Overweight")
    elif bmi > 18.5:
        print("Normal")
    else:
        print("Underweight")

if __name__ == "__main__":
    main()

