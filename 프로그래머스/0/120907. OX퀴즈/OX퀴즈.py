def solution(quiz):
    result = []
    for formula in quiz:
        if valid(formula):
             result.append("O")
        else:
            result.append("X")
    return result


def valid(formula):
    n = formula.split("=")
    print(n)
    expected = int(n[1])
    actual = int(eval(n[0]))
    if actual == expected:
        return True
    return False