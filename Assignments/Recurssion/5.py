def is_armstrong_number(num):
    original_num = num
    num_digits = len(str(num))
    armstrong_sum = sum(int(digit) ** num_digits for digit in str(num))
    return armstrong_sum == original_num

# Example usage
number1 = 153
result1 = is_armstrong_number(number1)
print("Input 1:", "Yes" if result1 else "No")

number2 = 134
result2 = is_armstrong_number(number2)
print("Input 2:", "Yes" if result2 else "No")
