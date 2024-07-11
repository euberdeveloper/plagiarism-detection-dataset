import sys

def main():
    weight = int(input("Enter weight in pounds: "))
    feet = int(input("Enter feet: "))
    inches = int(input("Enter inches: "))

    height = feet * 12 + inches
    bmi = weight * 0.45359237 / ((height * 0.0254) * (height * 0.0254))

    print(f"BMI is {bmi:.2f}")

    if bmi < 18.5:
        print("Underweight")
    elif 18.5 <= bmi < 25:
        print("Normal")
    elif bmi >= 35:
        print("Obese")

if __name__ == "__main__":
    main()

