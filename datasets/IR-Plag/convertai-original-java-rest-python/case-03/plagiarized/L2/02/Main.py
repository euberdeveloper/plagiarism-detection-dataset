import math

# Prompt the user to enter weight in pounds
weight_user = float(input("Enter weight in pounds: "))

# Prompt the user to enter height
# Enter feet
feet_user = float(input("Enter feet: "))
# Enter inches
inches_user = float(input("Enter inches: "))

# Process
height_user = feet_user * 12 + inches_user

# Compute BMI
bmi = weight_user * 0.45359237 / ((height_user * 0.0254) * (height_user * 0.0254))

# Display result
print("BMI is", round(bmi, 2))
if bmi < 18.5:
    print("Underweight")
elif bmi < 25:
    print("Normal")
elif bmi < 30:
    print("Overweight")
else:
    print("Obese")

