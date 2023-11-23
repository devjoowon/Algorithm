import sys

def input():
    return sys.stdin.readline().rstrip()

N, M = map(int, input().split())
by_num = {}
by_name = {}

for i in range(1, N + 1):
    pokemon = input()
    by_num[i] = pokemon
    by_name[pokemon] = i

for _ in range(M):
    x = input()
    if x.isdigit():
        print(by_num[int(x)])
    else:
        print(by_name[x])