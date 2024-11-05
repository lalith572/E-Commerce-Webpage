document.addEventListener('DOMContentLoaded', function() {
    const addToCartBtn = document.getElementById('add-to-cart-btn');
    const cartItems = document.getElementById('cart-items');
    const cartTotal = document.getElementById('cart-total');
    const productImageSrc = document.getElementById('product-image').src;
    const productName = document.getElementById('product-name').textContent;
    const productPrice = parseFloat(document.getElementById('product-price').textContent.replace(/[^0-9.-]+/g,""));

    let total = 0;

    addToCartBtn.addEventListener('click', function() {
      const itemPrice = productPrice;
      total += itemPrice;

      const li = document.createElement('li');
      li.classList.add('list-group-item', 'd-flex', 'justify-content-between', 'align-items-center');
      li.innerHTML = `
        <div class="d-flex align-items-center">
          <img src="${productImageSrc}" alt="Product Image" class="img-thumbnail" style="width: 50px; height: 50px; margin-right: 10px;">
          ${productName} - ${productPrice.toFixed(2)}
        </div>
        <button class="btn btn-danger btn-sm remove-btn">Remove</button>
      `;
      cartItems.appendChild(li);
      cartTotal.textContent = total.toFixed(2);

      li.querySelector('.remove-btn').addEventListener('click', function() {
        cartItems.removeChild(li);
        total -= itemPrice;
        cartTotal.textContent = total.toFixed(2);
      });
    });
  });