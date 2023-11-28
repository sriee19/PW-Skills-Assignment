# a. T(n) = T(n-1) + c
def recurrence_a(n):
    if n == 0:
        return 0
    else:
        return recurrence_a(n - 1) + 5

# b. T(n) = 2T(n/2) + n
def recurrence_b(n):
    if n == 1:
        return 1
    else:
        return 2 * recurrence_b(n // 2) + n

# c. T(n) = 2T(n/2) + c
def recurrence_c(n):
    if n == 1:
        return 1
    else:
        return 2 * recurrence_c(n // 2) + 5

# d. T(n) = T(n/2) + c
def recurrence_d(n):
    if n == 1:
        return 5
    else:
        return recurrence_d(n // 2) + 2

result_a = recurrence_a(5)
result_b = recurrence_b(8)
result_c = recurrence_c(8)
result_d = recurrence_d(16)

print("a. T(5) for recurrence relation: ", result_a)
print("b. T(8) for recurrence relation: ", result_b)
print("c. T(8) for recurrence relation: ", result_c)
print("d. T(16) for recurrence relation: ", result_d)
