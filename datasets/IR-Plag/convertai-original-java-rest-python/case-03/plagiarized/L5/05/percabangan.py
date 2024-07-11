import math

class inputoutput:
    kaki = 0.0
    bobot = 0.0
    bmi = 0.0
    inc = 0.0
    height = 0.0

    @staticmethod
    def hit_height(kaki, inc):
        return kaki * 12 + inc

    @staticmethod
    def hit_bmi(bobot, height):
        return bobot * 0.45359237 / ((height * 0.0254) * (height * 0.0254))

def main():
    input_obj = inputoutput()

    bobot = float(input("Enter weight in pounds: "))
    kaki = float(input("Enter feet: "))
    inc = float(input("Enter inches: "))

    height = inputoutput.hit_height(kaki, inc)
    bmi = inputoutput.hit_bmi(bobot, height)

    print(f"BMI is {bmi:.2f}")
    if bmi < 18.5:
        print("Underweight")
    elif bmi < 25:
        print("Normal")
    elif bmi < 30:
        print("Overweight")
    else:
        print("Obese")

if __name__ == "__main__":
    main()

