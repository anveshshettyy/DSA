/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */

struct ListNode* addTwoNumbers(struct ListNode* l1, struct ListNode* l2) {
    struct ListNode *head = NULL, *temp = NULL, *newnode = NULL;
    int carry = 0, sum;

    while( l1 || l2 || carry ) {
        sum = carry;

        if( l1 ) {
            sum += l1->val;
            l1 = l1->next;
        }

        if( l2 ) {
            sum += l2->val;
            l2 = l2->next;
        }

        carry = sum / 10;
        sum = sum % 10;

        newnode = (struct ListNode*)malloc(sizeof(struct ListNode));
        newnode->val = sum;
        newnode->next = NULL;

        if( head == NULL ) {
            head = newnode;
            temp = head;
        } else {
            temp->next = newnode;
            temp = temp->next;
        }
    }
    return head;
}