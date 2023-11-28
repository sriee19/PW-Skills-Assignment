# Recursive Tree Approach for T(n) = 2T(n-1) + 1
def recurrence_tree_a(n):
    if n == 0:
        return 1
    else:
        return 2 * recurrence_tree_a(n - 1) + 1

result_tree_a = recurrence_tree_a(3)  # Change the parameter as needed
print("Recursive Tree Approach for a. T(n) = 2T(n-1) + 1:", result_tree_a)


# Recursive Tree Approach for T(n) = 2T(n/2) + n
def recurrence_tree_b(n):
    if n == 1:
        return 1
    else:
        return 2 * recurrence_tree_b(n // 2) + n

result_tree_b = recurrence_tree_b(8)  # Change the parameter as needed
print("Recursive Tree Approach for b. T(n) = 2T(n/2) + n:", result_tree_b)
