import java.util.Scanner;
class AVLTree
{
    // Estrutura de Noh
    class Node
    {
        int value;
        int height;
        Node left;
        Node right;

        public Node(int value)
        {
            this.value = value;
            this.height = 1;
            this.left = null;
            this.right = null;
        }
    }

    // retorna a altura do nó
    int Height(Node key)
    {
        if (key == null)
            return 0;

        else
            return key.height;
    }


    // Balance calcula o fator de balanceamento do nó
    int Balance(Node key)
    {
        if (key == null)
            return 0;

        else
            return ( Height(key.right) - Height(key.left) );
    }


    // updateHeight atualiza a altura do nó
    void updateHeight(Node key)
    {
        int l = Height(key.left);
        int r = Height(key.right);

        key.height = Math.max(l , r) + 1;
    }

    Node rotateLeft(Node x)
    {
        Node y = x.right;
        Node T2 = y.left;

        y.left = x;
        x.right = T2;

        updateHeight(x);
        updateHeight(y);

        return y;
    }

    Node rotateRight(Node y)
    {
        Node x = y.left;
        Node T2 = x.right;

        x.right = y;
        y.left = T2;

        updateHeight(y);
        updateHeight(x);

        return x;
    }

    // balanceTree equilibra a árvore usando rotações após uma inserção ou exclusão
    Node balanceTree(Node root)
    {
        updateHeight(root);

        int balance = Balance(root);

        if (balance > 1) //R
        {
            if (Balance(root.right) < 0)//RL
            {
                root.right = rotateRight(root.right);
                return rotateLeft(root);
            }

            else //RR
                return rotateLeft(root);
        }

        if (balance < -1)//L
        {
            if (Balance(root.left) > 0)//LR
            {
                root.left = rotateLeft(root.left);
                return rotateRight(root);
            }
            else//LL
                return rotateRight(root);
        }

        return root;
    }

    Node Root;


    Node BSTInsert(Node root, int key)
    {
        // Executa a inserção normal de BST
        if (root == null)
            return new Node(key);

        else if (key < root.value)
            root.left = BSTInsert(root.left, key);

        else
            root.right = BSTInsert(root.right, key);

        // Equilibra a árvore após a inserção do BST
        return balanceTree(root);
    }

    // Sucessor retorna o próximo maior nó
    Node Successor(Node root)
    {
        if (root.left != null)
            return Successor(root.left);

        else
            return root;
    }


    Node Remove(Node root, int key)
    {
        // Executa a exclusão BST padrão
        if (root == null)
            return root;

        else if (key < root.value)
            root.left = Remove(root.left, key);

        else if (key > root.value)
            root.right = Remove(root.right, key);

        else
        {
            if (root.right == null)
                root = root.left;

            else if (root.left == null)
                root = root.right;

            else
            {
                Node temp = Successor(root.right);
                root.value = temp.value;
                root.right = Remove(root.right, root.value);
            }
        }

        if (root == null)
            return root;

        else
            // Equilibra a árvore após a exclusão
            return balanceTree(root);
    }

    // findNode é usado para procurar um valor específico dado a raiz
    Node findNode(Node root, int key)
    {
        if (root == null || key==root.value)
            return root;

        if (key < root.value)
            return findNode(root.left, key);

        else
            return findNode(root.right, key);
    }

    // Função de utilidade para inserção de nó
    void add(int key)
    {
        if (findNode(Root , key) == null)
        {
            Root = BSTInsert(Root , key);
            System.out.println("Inserção bem-sucedida");
        }

        else
            System.out.println("\nA chave com o valor inserido já existe na árvore");
    }

    int search(int key)
    {
        if(findNode(Root, key) == null)
            return 0;
        else
            return 1;
    }

    // Função de utilidade para exclusão de nó
    void delete(int key)
    {
        if (findNode(Root , key) != null)
        {
            Root = Remove(Root , key);
            System.out.println("\nExclusão bem-sucedida ");
        }

        else
            System.out.println("\nNenhum nó com valor inserido encontrado na árvore");
    }

    void InOrder(Node root)
    {
        if(root == null)
        {
                System.out.println("\nNenhum nó na árvore");
            return;
        }

        if(root.left != null)
            InOrder(root.left);
        System.out.print(root.value + " ");
        if(root.right != null)
            InOrder(root.right);

    }

    void PreOrder(Node root)
    {
        if(root == null)
        {
            System.out.println("Nenhum nó na árvore");
            return;
        }

        System.out.print(root.value + " ");
        if(root.left != null)
            PreOrder(root.left);
        if(root.right != null)
            PreOrder(root.right);

    }

    void PostOrder(Node key)
    {
        if(key == null)
        {
            System.out.println("Nenhum nó na árvore");
            return;
        }


        if(key.left != null)
            PostOrder(key.left);
        if(key.right != null)
            PostOrder(key.right);
        System.out.print(key.value + " ");

    }

}

public class AVLT
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        AVLTree tree = new AVLTree();
        // 51, 57, 98, 19, 11, 45, 79
        tree.add(51);
        tree.add(57);
        tree.add(98);
        tree.add(19);
        tree.add(11);
        tree.add(45);
        tree.add(79);

        tree.PreOrder(tree.Root);
        System.out.println();
        tree.InOrder(tree.Root);
        System.out.println();
        tree.PostOrder(tree.Root);

        tree.Remove(tree.Root, 19);
        System.out.println();
        tree.InOrder(tree.Root);

    }
}
