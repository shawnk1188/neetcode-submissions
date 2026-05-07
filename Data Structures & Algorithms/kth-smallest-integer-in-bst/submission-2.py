class Solution:
    def __init__(self):
        self.count = 0
        self.result = 0

    def kthSmallest(self, root: Optional[TreeNode], k: int) -> int:
        self.inOrderTraverse(root, k)
        return self.result
        
    def inOrderTraverse(self, root: Optional[TreeNode], k: int):
        if root is None or self.count >= k:
            return
        
        self.inOrderTraverse(root.left, k)
        
        self.count += 1
        if self.count == k:
            self.result = root.val
            return
            
        self.inOrderTraverse(root.right, k)