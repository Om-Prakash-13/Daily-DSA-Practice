# Allocate Minimum Number of Pages from N books to M students (GeeksForGeeks)

## Problem Description

Given that there are N books and M students. Also given are the number of pages in each book in ascending order. The task is to assign books in such a way that the maximum number of pages assigned to a student is minimum, with the condition that every student is assigned to read some consecutive books. Print that minimum number of pages.


### Example 1:

**Input:** N = 4, pages[] = {12, 34, 67, 90}, M = 2

**Output:** 113

**Explanation:** There are 2 students. Books can be distributed in following combinations:
<ul>
    <li>{12} and {34, 67, 90} -> Max number of pages is allocated to student 2 with 34 + 67 + 90 = 191 pages</li>
    <li>{12, 34} and {67, 90} -> Max number of pages is allocated to student 2 with 67 + 90 = 157</li>
    <li>{12, 34, 67} and {90} -> Max number of pages is allocated to student 1 with 12 + 34 + 67 = 113 pages</li>
</ul>

The third combination has the minimum pages assigned to a student = 113.


### Example 2:
**Input:** N = 3, pages[] = {15, 17, 20}, M = 2

**Output:** 32

**Explanation:** There are 2 students. Books can be distributed in following combinations:
- {15} and {17, 20} -> Max number of pages is allocated to student 2 with 17 + 20 = 37 pages
- {15, 17} and {20} -> Max number of pages is allocated to student 1 with 15 + 17 = 32 pages

The second combination has the minimum pages assigned to a student = 32.