class Solution:
    def orangesRotting(self, grid: List[List[int]]) -> int:
        if not grid:
            return 0
        
        queue = deque()
        fresh = 0
        time = 0
        rows, cols = len(grid), len(grid[0])
        directions = [[1,0],[0,1],[-1,0],[0,-1]]

        for r in range(rows):
                for c in range(cols):
                    if grid[r][c] == 1:
                        fresh += 1
                    
                    if grid[r][c] == 2:
                        queue.append((r,c))
        
        while queue and fresh > 0:
            for i in range(len(queue)):
                r, c = queue.popleft()
                for dr, dc in directions:
                    nr, nc = r + dr, c + dc
                    if (nr < 0 or nr == rows or
                        nc < 0 or nc == cols or
                        grid[nr][nc] != 1):
                        continue
                    grid[nr][nc] = 2
                    queue.append((nr,nc))
                    fresh -= 1
                        
                    
            time +=1
                    
        return time if fresh == 0 else -1


        
            
        
            
                    

        