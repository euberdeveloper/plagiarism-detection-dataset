import sys

# Prompt the user to enter weight in pounds
inches = float(input("Enter inches: "))
weight = float(input("Enter weight in pounds: "))
feet = float(input("Enter feet: "))

# Process
height = feet * 12 + inches
bmi = weight * 0.45359237 / ((height * 0.0254) * (height * 0.0254))

# Display result
print(f"BMI is {bmi:.2f}")
if bmi < 18.5:
    print("Underweight")
elif bmi < 25:
    print("Normal")
elif bmi < 30:
    print("Overweight")
else:
    print("Obese")

