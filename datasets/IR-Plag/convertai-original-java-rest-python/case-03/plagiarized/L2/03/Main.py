import math

# Prompt the user to enter weight in pounds
weight_lbs = float(input("Enter weight in pounds: "))

# Prompt the user to enter height
feet = float(input("Enter feet: "))
inches = float(input("Enter inches: "))
height_inches = feet * 12 + inches

# Compute BMI
weight_kg = weight_lbs * 0.45359237
height_m = height_inches * 0.0254
bmi = weight_kg / (height_m ** 2)

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

