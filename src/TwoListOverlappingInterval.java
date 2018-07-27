public class TwoListOverlappingInterval {

//    def intersects(a,b):
//    ranges = []
//    i = j = 0
//            while i < len(a) and j < len(b):
//    a_left, a_right = a[i]
//    b_left, b_right = b[j]
//    end_pts = sorted([a_left, a_right, b_left, b_right])
//    middle = [end_pts[1], end_pts[2]]
//
//            if a_right < b_right:
//    i += 1
//            else:
//    j += 1
//
//            if a_right >= b_left and b_right >= a_left:
//            ranges.append(middle)
//
//            for i in range(len(ranges)-1):
//            if ranges[i][1] in (ranges[i+1][0], ranges[i+1][0]-1):
//    ranges[i:i+2] = [[ranges[i][0], ranges[i+1][1]]]
//
//            return ranges
//
//    a = [[0,2], [5,10], [13,23], [24,25]]
//    b = [[1,5], [8,12], [15,18], [20,24]]
//    print(intersects(a,b))
//            # [[1, 2], [5, 5], [8, 10], [15, 18], [20, 24]]


}
