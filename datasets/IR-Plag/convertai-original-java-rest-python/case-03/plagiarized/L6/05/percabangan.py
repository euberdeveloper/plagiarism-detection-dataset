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

    input_obj.bobot = float(input("Enter weight in pounds: "))
    input_obj.kaki = float(input("Enter feet: "))
    input_obj.inc = float(input("Enter inches: "))
    input_obj.height = input_obj.hit_height(input_obj.kaki, input_obj.inc)
    input_obj.bmi = input_obj.hit_bmi(input_obj.bobot, input_obj.height)

    print(f"BMI is {input_obj.bmi:.2f}")
    if input_obj.bmi >= 30:
        print("Obese")
    elif input_obj.bmi >= 25:
        print("Overweight")
    elif input_obj.bmi >= 18.5:
        print("Normal")
    else:
        print("Underweight")

if __name__ == "__main__":
    main()

