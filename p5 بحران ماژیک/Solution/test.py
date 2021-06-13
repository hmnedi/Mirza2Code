marks = list(map(int, input().split()))

n = len(marks)

marks = list(set(marks))
if len(marks) != n:
    tmp = n - len(marks)
    for i in range(tmp):
        marks.append(0)

marks.sort()
for x in marks:
    print(x, end=' ')
